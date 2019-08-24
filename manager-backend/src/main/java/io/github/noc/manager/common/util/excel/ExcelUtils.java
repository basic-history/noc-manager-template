package io.github.noc.manager.common.util.excel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

/**
 * 读取或者生成简单的excel文件
 * @author abeir
 * @deprecated 建议使用{@link com.tfcpay.kratosmanage.common.util.excel.ExcelReader}
 */
@Deprecated
public class ExcelUtils {
	//所有excel导出分页每页的行数
	public static final int ROW_LEN = 65535;

	private InputStream inputStream;
	private SimpleDateFormat foramt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public ExcelUtils() {
	}

	public ExcelUtils(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void setFilePath(InputStream filePath) {
		this.inputStream = inputStream;
	}

	private void processRow(Row row, ExcelStorer storer) {
		int rowNum = storer.columnNum();
		if (rowNum < 1)
			return;
		List<String> rowList = new ArrayList<String>();
		for (int i = 0; i < rowNum; i++) {
			Cell cell = row.getCell(i);
			// 遇见空的单元格，将赋予null
			if (cell == null) {
				rowList.add(null);
				continue;
			}
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_BOOLEAN:
				rowList.add(String.valueOf(cell.getBooleanCellValue()));
				break;
			case Cell.CELL_TYPE_NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					rowList.add(this.foramt.format(cell.getDateCellValue()));
				} else {
					rowList.add(NumberToTextConverter.toText(cell
							.getNumericCellValue()));
				}
				break;
			case Cell.CELL_TYPE_STRING:
				rowList.add(cell.getRichStringCellValue().getString());
				break;
			default:
				rowList.add(null);
				break;
			}
		}
		storer.save(rowList);
	}

	/**
	 * 读取excel，可以读取xls和xlsx
	 * 
	 * @param storer
	 *            ExcelStorer的实现类，用于自定义每行数据的保存方式
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void read(ExcelStorer storer) throws InvalidFormatException,
			IOException {
		InputStream input = null;
		Workbook wk = null;
		try {
			input = inputStream;
			wk = WorkbookFactory.create(input);
			int beginRowNum = storer.begin();
			int sheetNum = wk.getNumberOfSheets();
			for (int i = 0; i < sheetNum; i++) {
				Sheet sheet = wk.getSheetAt(i);
				for (Row row : sheet) {
					if (row.getRowNum() < beginRowNum)
						continue;
					this.processRow(row, storer);
				}
			}
		} finally {
			storer = null;
			if (input != null)
				input.close();
		}
	}
	
	/**
	 * 读取excel，可以读取xls和xlsx
	 * 
	 * @param storer
	 *            ExcelStorer的实现类，用于自定义每行数据的保存方式
	 * @param input 
	 * 			  
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void read(ExcelStorer storer,InputStream input) throws InvalidFormatException,
			IOException {
		Workbook wk = null;
		try {
			wk = WorkbookFactory.create(input);
			int beginRowNum = storer.begin();
			int sheetNum = wk.getNumberOfSheets();
			for (int i = 0; i < sheetNum; i++) {
				Sheet sheet = wk.getSheetAt(i);
				for (Row row : sheet) {
					if (row.getRowNum() < beginRowNum)
						continue;
					this.processRow(row, storer);
				}
			}
		} finally {
			storer = null;
			if (input != null)
				input.close();
		}
	}

	// 将过多的结果集拆分
	private List<?>[] partition(List<?> result) {
		int size = result.size();
		int partNo = 0;
		if (size % ROW_LEN == 0)
			partNo = 1;
		else
			partNo = size / ROW_LEN + 1;
		List<?>[] list = new List[partNo];
		for (int i = 0; i < partNo; i++) {
			if (i + 1 == partNo) {
				list[i] = result.subList(i * ROW_LEN, size);
			} else {
				list[i] = result.subList(i * ROW_LEN, (i + 1) * ROW_LEN);
			}
		}
		return list;
	}

	//设置每个单元格长度
	private void setWidth(Sheet sheet,Integer[] columnWidth) {
		if(columnWidth == null)
			return ;
		for(int i=0;i<columnWidth.length;i++){
			sheet.setColumnWidth(i,columnWidth[i]);
		}
	}
	private void createHead(String[] header, Sheet sheet, CellStyle style) {
		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < header.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(header[i]);
			cell.setCellStyle(style);
		}
	}

	private void createBodyCell(Object rowObj, String[] columns, Row row)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		for (int i = 0; i < columns.length; i++) {
			String value = BeanUtils.getProperty(rowObj, columns[i]);
			if (StringUtils.isNotBlank(value)) {
				Cell cell = row.createCell(i);
				cell.setCellValue(value);
			}
		}
	}
	private void createBodyCell(Object rowObj, String[] columns, Row row,Map<String,String> formatResuMap)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		for (int i = 0; i < columns.length; i++) {
			Object value = PropertyUtils.getProperty(rowObj, columns[i]);
			Cell cell = row.createCell(i);
			//若该字段在格式化后的结果map中，则取map中的value
			if(formatResuMap.containsKey(columns[i])){
				cell.setCellValue(formatResuMap.get(columns[i]));
			}else{
				cell.setCellValue(value==null ? StringUtils.EMPTY : String.valueOf(value));
			}
		}
	}

	private void createBody(List<?> result, String[] columns, Sheet sheet)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		int i = 1; 
		for (Object rowObj : result) {
			Row row = sheet.createRow(i);
			i++;
			//格式化行
			createBodyCell(rowObj, columns, row);
		}
	}
	
	private void createBody(List<?> result, String[] columns, Sheet sheet,Map<String,ContentFormat> formatMap)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		int i = 1; 
		for (Object rowObj : result) {
			Row row = sheet.createRow(i);
			i++;
			//格式化行
			Map<String,String> finalResuMap = formatRow(rowObj,formatMap);
			createBodyCell(rowObj, columns, row,finalResuMap);
		}
	}
	
	private Map<String,String> formatRow(Object rowObj,Map<String,ContentFormat> formatMap)
			throws NoSuchMethodException,InvocationTargetException,IllegalAccessException{
		Map<String,String> formatResuMap = new HashMap<String,String>();
		for(String column : formatMap.keySet()){
			ContentFormat format =formatMap.get(column);
			Object value = null;
			try{
				value = PropertyUtils.getProperty(rowObj,column);
			}catch(IllegalAccessException | InvocationTargetException| NoSuchMethodException e){
			}
			Object formatValueObj = format.format(value,rowObj);
			formatResuMap.put(column, String.valueOf(formatValueObj));
		}
		return formatResuMap;
	}
	
	/**
	 * 写入xls格式的excel<br>
	 * 注意，该方法不会关闭流
	 * @param builder
	 *            设置需要写入excel的表头、结果集和结果集中的属性
	 * @param stream
	 *            输出流，该方法不会关闭流
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 */
	public void write(ExcelBuilder builder, OutputStream stream)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException, IOException {
		try(
			HSSFWorkbook wk = new HSSFWorkbook();
				
				){
			// 字体加粗
			Font font = wk.createFont();
			font.setBold(true);
			CellStyle style = wk.createCellStyle();
			style.setFont(font);

			String[] header = builder.header();
			String[] columns = builder.columns();
			Integer[] columnWidth = builder.columnWidth();
			Map<String,ContentFormat> formatMap = builder.formatMap();
			boolean needFormat = true;
			if(formatMap == null || formatMap.keySet().size() <=0)
				needFormat =false;
			List<?> result = builder.result();
			// 若数据过多需要分拆成多个sheet容纳
			List<?>[] partRs = partition(result);
			for (List<?> subRs : partRs) {
				Sheet sheet = wk.createSheet();
				setWidth(sheet,columnWidth);
				createHead(header, sheet, style);
				if(needFormat)
					createBody(subRs, columns,sheet,formatMap);
				else
					createBody(subRs, columns, sheet);
			}
			wk.write(stream);
			builder = null;
		}
	}

	/**
	 * 自定义每一行的保存操作
	 */
	public interface ExcelStorer {
		/**
		 * 从其实的行开始读取，0为第一行
		 * 
		 * @return
		 */
		public int begin();

		/**
		 * 列数
		 * 
		 * @return
		 */
		public int columnNum();

		/**
		 * 获取到每一行后，执行每一行的处理操作
		 * 
		 * @param row
		 *            每一行的数据，若单元格有空值，返回的值为null
		 */
		public void save(List<String> row);
	}

	/**
	 * 定义写入excel的结果集，结果集中属性以及表头 结果集中存储的可以是bean，也可以是map，不能使用Collection或数组
	 */
	public interface ExcelBuilder {
		/**
		 * Excel的表头
		 * 
		 * @return
		 */
		public  String[] header();

		/**
		 * 需要写入excel的数据集中的对象属性名称或者Map类型的key值
		 * 
		 * @return
		 */
		public  String[] columns();
		
		/**
		 * 写入excel的数据集
		 * 
		 * @return
		 */
		public  List<?> result();
		
		/**
		 * 用于设置每个字段的宽度，若返回null则不使用
		 * @return
		 */
		public Integer[] columnWidth();
		
		/**
		 * 格式化map
		 * @return <columnName,ContentFormat> 
		 */
		public Map<String,ContentFormat> formatMap();

	}
	
	public interface ContentFormat{
		/**
		 * 格式化输入参数 例：00->交易成功
		 * @param value		待格式化的数据
		 * @param row		该行数据
		 * @return	
		 */
		public Object format(Object value,Object row);
	}
}

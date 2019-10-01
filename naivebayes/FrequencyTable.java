package naivebayes;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyTable {
	String tableName;
	String[][] arrayFrequency;
	public FrequencyTable(String tableName, int row, int column) {
		this.tableName = tableName;
		arrayFrequency = new String[row+1][column+1];//+1 olarak oluşturmamın sebebi ilk satır ve sutuna kolonlardaki bilginin girilmesi içindir.
		
	}
	public void createFrequencyTable(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
		int count = 0;
		int iterator= 0;
		for (String object : arrayList1) {
			count = 0;
			//for (int i = 0; i < values.length; i++) {
				//if (object.equals(values[i])) {
				//	count++;
				//}
			//}
			//arrayFrequency
		}
	}
	//columnDistinctValues  -> her bir kolonun içerisindeki değerleri bulundurur. key = kolonismi   value=içerdiği değer listesi(her bir değerden sadece 1 adet bulunur.(distinct))
	public void create(HashMap<String, String[]> values, String columnName,String columnName2, HashMap<String, ArrayList> columnDistinctValues) {
		fillColumnNames(columnDistinctValues, columnName, columnName2);
		HashMap<String, Integer> columnName2ValueCount =new HashMap<String, Integer>();
		for (int i = 0; i < columnDistinctValues.get(columnName).size(); i++) {
			columnName2ValueCount.clear();
			String rowValue = (String) columnDistinctValues.get(columnName).get(i);
			for (int j = 0; j < values.get(columnName).length; j++) {
				String rowValue2 = values.get(columnName)[j];
				if (!columnName2ValueCount.containsKey(values.get(columnName2)[j])) {
					columnName2ValueCount.put(values.get(columnName2)[j], 0);
				}
				if (rowValue.equals(rowValue2)) {
					String colValue = values.get(columnName2)[j];///
					
					columnName2ValueCount.replace(colValue, columnName2ValueCount.get(colValue)+1);
					//System.out.println(rowValue +"//"+colValue +"  =  "+ columnName2ValueCount.get(colValue) );

				}
			}
			putValuestoFrequencyArray(columnName2ValueCount,rowValue);
		}
		
	}
	private void putValuestoFrequencyArray(HashMap<String, Integer> columnName2ValueCount, String rowValue) {
		boolean isAdded = false;
		///System.out.println("Row Value == " + rowValue);
		for (int i = 1; i < arrayFrequency.length; i++) {
			if (arrayFrequency[i][0].equals(rowValue) && !isAdded) {
				for (String key : columnName2ValueCount.keySet()) {
					for (int j = 1; j < arrayFrequency[0].length; j++) {
						if (arrayFrequency[0][j].equals(key)) {
								arrayFrequency[i][j] =Integer.toString(columnName2ValueCount.get(key));
						}
					}
				}
				isAdded = true;
			}
		}
		
		//System.out.println("-----------------------------------------");
		//printMatrix(arrayFrequency);
	}
	
	private void fillColumnNames(HashMap<String, ArrayList> columnDistinctValues, String columnName,String columnName2) {
		//Sütun
		arrayFrequency[0][0] = columnName + "/" + columnName2;
		for (int i = 0; i < columnDistinctValues.get(columnName2).size(); i++) {
			arrayFrequency[0][i+1] = (String) (columnDistinctValues.get(columnName2)).get(i);
		}
		//Satır
		for (int j = 0; j < columnDistinctValues.get(columnName).size(); j++) {
			arrayFrequency[j+1][0] = (String) (columnDistinctValues.get(columnName)).get(j);
		}
	}
	
	private void printMatrix(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print ("	" +matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
	}
	
}

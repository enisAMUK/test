package naivebayes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class NaiveBayes {
	private static String [][] matrix;
	private String columnName = "";
	private ArrayList<FrequencyTable> frequencyTableList = new ArrayList<FrequencyTable>();
	public NaiveBayes() {
		columnName = "PlayGolf";
		fillTableFromFile();
	}
	
	public void calculateNaiveBayes() {
		extractValues(matrix, columnName);
	}
	//
	//
	/*Bu metot verilen matrisin içerisinden istenilen iki kolona göre frekansları ile ilgili tabloları oluşturur.
	 * frTableName   -> matristeki sütunlardan bir tanesinin başlığının ismi
	 * columnName	->	matristeki sütunlardan istenilen bir tanesinin başlığının ismi/karşılaştırılacak olan kolonun ismi. örneğin Sıcaklığı Oyun kolonu ile karşılaştıracak isek "columnName= Oyun" olur
	 * Yani frTableName kolonundaki bilgilere göre columnName kolunundaki değerlerin sayıları(frekansları) hesaplanıp frekans tablosu oluşturulacak.
	 * columnValues
	 */
	public void fillFrequencyTables(HashMap<String, String[]> values, String frTableName, String columnName) {
		//FrequencyTable frequencyTable = new FrequencyTable(frTableName, values.size(), values.get(0).length);
		HashMap<String, ArrayList> columnValues = new HashMap<String, ArrayList>();///her bir kolonun içerisindeki değerlerin distinct olarak ayırmak için tutulmuş bir hasmaptir. Yani key = outlook value = "Rainy, Overcast, Sunny"
		for (String key : values.keySet()) {
			ArrayList arrayList = findDistinctValues(values.get(key));
			columnValues.put(key, arrayList);
		}
		System.out.println("++++++START PRINTING FREQUENCY TABLE++++++");
		for (String column : columnValues.keySet()) {
			if (!column.equals(columnName)) {
				
				String frequencyTableName = column + "_" + columnName;
				FrequencyTable frequencyTable = new FrequencyTable(frequencyTableName,
				columnValues.get(column).size(), columnValues.get(columnName).size());
				frequencyTable.create(values, column, columnName, columnValues); //(values, columnName, volumnValues)
				printMatrix(frequencyTable.arrayFrequency);
				frequencyTableList.add(frequencyTable);
				
				/*-------
				burada frequencyTable oluşturulduktan sonra likelihood tablosu oluşturulmalı.
				bu tabloda oluşan frekansları olasılıksal olarak değerleri tutulmalı.
				----*/
			}
		}
		System.out.println("++++++END PRINTING FREQUENCY TABLE++++++");
		
		/*for (String key : values.keySet()) {
			for (int i = 0; i < values.get(key).length; i++) {
				System.out.println(" Key = " + key + "  value --> " + values.get(key)[i]);
			}
			System.out.println();
		}*/
		
	}
	public void fillLikelihoodTable(FrequencyTable frequencyTable) {
		
	}
	
	///matrix[0].length  -> matristeki sütun sayısını verir
	///matrix.length  -> matristeki satır sayısını verir
	/// [][] matrix	-> bütün bilgilerin tutulduğu matris
	///	columnName	-> tabloların neye göre oluşturulması gerektiği bilgisini tutar. Yani matristeki istenilen kolonun ismini tutar. 
					 //Örneğin; Hava, sıcaklık,yağış üç kolonumuz olsun. Yağışa göre tablolar oluşsun istiyor isek Hava-Yağış, Sıcaklık-yağış şeklinde tabloların oluşturulmasını istiyoruz demektir.
	
	public void extractValues(String [][] matrix, String columnName) {
		//String [] tableNames = new String[matrix[0].length];
		// Matristeki ilk satırdaki değerler oluşturulacak olan alt tabloların(FrequencyTable, LikelihoodTable vs.) isimlerini içerecek şekilde olması düşünülmüştür.		
		HashMap<String, String[]> values = new HashMap<String, String[]>();
		//döngü başlangıçç
		//bu döngüde alınan matrisi bir hashmap içerisinde key=sütun ve value = satırdizisi olacak şekilde doldurmaya yarar.
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0) {
					//tableNames[j] = matrix[i][j];
					if (!values.containsKey(matrix[i][j])) {
						values.put(matrix[i][j], new String[matrix.length-1]);
					}
				}
				else {
					//if (!columnName.equals(tableNames[j])) {
						//fillFrequencyTable(matrix,tableNames[j],columnName);						
					//}
					(values.get(matrix[0][j]))[i-1] = matrix[i][j]; 
					
				}
			}
		}
		System.out.println("------START PRINTING VALUES------");
		printHashMapValues(values);
		System.out.println("------END PRINTING VALUES------");
		////döngü bitiş
		
		
		fillFrequencyTables(values, "", columnName);
		
	}

	
	public ArrayList findDistinctValues(String[] array) {
		ArrayList arrayList = new ArrayList();
		for (String value : array) {
			if (!arrayList.contains(value)) {
				arrayList.add(value);
			}
		}
		return arrayList;
	}
	
	
	private void fillTableFromFile() {
		File file = new File("C:\\Users\\eamuk\\eclipse-workspace\\theorems\\src\\naivebayes\\Whether.txt"); 
		  
		try {
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st;
			  int row=0,col=0;
			  while ((st = br.readLine()) != null) {
				  row++;
				  col = st.split("\t").length;
			  }
			  br.close();
			  BufferedReader br2 = new BufferedReader(new FileReader(file));
			  int i = 0;
			  while ((st = br2.readLine()) != null) {
				  if (matrix == null) {
					matrix = new String[row][col];
				  }
				  for (int j = 0; j < col; j++) {
					matrix[i][j] = st.split("\t")[j];
				  }
				  i++; 
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	private void printHashMapValues(HashMap<String, String[]> values) {
		for (String key : values.keySet()) {
			System.out.println("Key = " + key);
			for (int i = 0; i < values.get(key).length; i++) {
				System.out.print("	"+ values.get(key)[i]);
			}
			System.out.println();
		}
	}
}

package naivebayes;

public class LikelihoodTable {
	String tableName;
	double[][] arrayLikelihood;
	public LikelihoodTable(String tableName, int row, int column) {
		this.tableName = tableName;
		arrayLikelihood = new double[row][column];
	}
}

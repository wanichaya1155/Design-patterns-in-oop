public class App {

	public static void main(String[] args) {
		
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stock = new AdapterStock(new StockMarketDataParser());
		parse(realEstate);
		parse(machineLearning);
		parse(stock);
		
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}


public class AdapterStock implements CSVParser {

	private StockMarketDataParser adapstock;
	
	public AdapterStock(StockMarketDataParser adapstock) {
		this.adapstock = adapstock;
	}

    @Override
    public void parseCSV() {
       adapstock.parseFromCSV();
    }
}
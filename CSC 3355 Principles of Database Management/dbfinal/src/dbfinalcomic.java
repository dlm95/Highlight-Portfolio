import java.util.List;
import edu.wssu.compsci.databases.comicbook.ComicBookParser;
import edu.wssu.compsci.databases.comicbook.Customer;

public class dbfinalcomic {

	public static void main(String[] args) {
		
		DBConnector db = new DBConnector("db-s17-group3","e#2zPj!P");
		
		ComicBookParser cb = new ComicBookParser("completedata.txt");
		
		List<Customer> customers = cb.getCustomerList();
		
		for(Customer cust: customers){
			
			string query = "Insert into tablename "
			
		}


	}

}

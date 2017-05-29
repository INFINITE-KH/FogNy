import Service.Entity.Carport;
import Service.Entity.Customer;
import data.Mapper.DBFacade;
import data.exception.CarportException;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnit {
    static DBFacade dbf;
    
    public JUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        dbf = new DBFacade();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetCarport() throws CarportException{
        Carport tjekCarport = new Carport(1, "CP01 DUR", "600x780", 0.0);
        Carport dbCarport = dbf.getCarport(1);
        assertEquals(tjekCarport.getId(), dbCarport.getId());
        assertEquals(tjekCarport.getCarname(), dbCarport.getCarname());
        assertEquals(tjekCarport.getMeasure(), dbCarport.getMeasure());
        assertEquals(tjekCarport.getPrice(), dbCarport.getPrice(), 0.0 );
    }
    
        @Test
    public void testCreateCustomer() throws SQLException{
        Customer tjekCostumer = new Customer("testFname","testLname" ,"testAddress" , 12345678,"test@mail.com" );
        dbf.createCustomer(tjekCostumer);
        Customer dbCostumer = null;
        List<Customer> dbCostumers = dbf.getAllCustomer();
        for(Customer c : dbCostumers){
            if(c.getFname().equals(tjekCostumer.getFname())){
                dbCostumer = c;
            }
        }
        assertEquals(tjekCostumer.getFname(), dbCostumer.getFname());
        assertEquals(tjekCostumer.getLname(), dbCostumer.getLname());
        assertEquals(tjekCostumer.getAdress(), dbCostumer.getAdress());
        assertEquals(tjekCostumer.getCphone(), dbCostumer.getCphone());
        assertEquals(tjekCostumer.getMail(), dbCostumer.getMail());
        
    
    }
    
}
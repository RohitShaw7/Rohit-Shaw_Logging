import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Logging_ConstructionCost

{
	private static final Logger LOGGER = LogManager.getLogger(Logging_ConstructionCost.class);
    static
    {
        try
        {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            LOGGER.info("Enter the material standard : \\n Enter 1 standard material \\n Enter 2 above standard material \\n Enter 3 high standard material \\n");
            int option = Integer.parseInt(br.readLine());
            LOGGER.info("You want fully automated home? (Y/N) :");
            String yes_no = br.readLine();
            LOGGER.info("Total Area of House :");
            float area = Float.parseFloat(br.readLine());
            if(option == 1)
            {
            	LOGGER.info("Cost = "+(area*1200));
            }
            else if(option == 2){
            	LOGGER.info("Cost = "+(area*1500));
            }
            else if(option == 3){
            	LOGGER.info("Cost = "+(area*1800));
            }
            else if(option == 3 && yes_no.toLowerCase().charAt(0)=='y'){
            	LOGGER.info("Cost = "+(area*2500));
            }
            else
            {
            	LOGGER.info("Total Area of House :");
            }
            System.exit(0);
        }
        catch(Exception e)
        {
            LOGGER.error("ERROR!!!!");
        }
    }
}







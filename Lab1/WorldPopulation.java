import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class WorldPopulation{

	static SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortStrategy = new InsertionSort(); // Set the default strategy here.
	}
	
	public void readInputFile(){
		population = readPopulationFile("WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		int counter = 0;
	  try {
		  FileReader inputFile = new FileReader(fileName);
		  BufferedReader reader = new BufferedReader(inputFile);
		  for(int i =0 ; i<13483;i++) {
		  String line = reader.readLine();
		  
			  StringTokenizer tokenizer = new StringTokenizer(line,",");
			  tokenizer.nextToken();
			  tokenizer.nextToken();
			  String pop = tokenizer.nextToken();
			  //System.out.print(pop+",");
					 long popcount = Long.parseLong(pop);	
					 //System.out.print(popcount+",");
			  population[counter] = popcount;
			  counter++;
		  }
		 
		  reader.close();
	  }
	  catch(Exception e) {
		  System.out.println("Exception occured "+e);
	  }
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation(SortStrategy strategy){	
		strategy.getSortTime(population);
		
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		
		worldPopulation.readInputFile();
		SelectionSort ss = new SelectionSort();//Object for selection sort
		worldPopulation.setStrategy(ss); //Setting selection sort as the strategy
		worldPopulation.sortPopulation(ss);
		
		worldPopulation.readInputFile();
		InsertionSort is = new InsertionSort();
		worldPopulation.setStrategy(is);
		worldPopulation.sortPopulation(is);
		
		worldPopulation.readInputFile();
		BubbleSort bs = new BubbleSort();
		worldPopulation.setStrategy(bs);
		worldPopulation.sortPopulation(bs);
	}

}

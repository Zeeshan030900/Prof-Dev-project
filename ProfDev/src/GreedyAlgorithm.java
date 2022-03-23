import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GreedyAlgorithm {

	   public static void main(String args[])
	    {   	
	    	// quick sort = moves smaller elements to left of a pivot.
	    	//			   recursively divide array in 2 partitions

	    	//                       run-time complexity = Best case O(n log(n))
	    	//				   		                   Average case O(n log(n))
	    	//				   		                   Worst case O(n^2) if already sorted
	    	
	    	//                       space complexity    = O(log(n)) due to recursion
	    	
	    //    int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
		   
		    Scanner scanner = new Scanner(System.in); // Scanner class allows user input
		    
	        
	        Movie movie1 = new Movie("Horror", "Alien");
	        Movie movie2 = new Movie("Sci-Fi", "Star Wars");
	        Movie movie3 = new Movie("Animation", "Lion King");
	        Movie movie4 = new Movie("Horror", "Scream");
	        /*
	         * A bunch of Movie objects
	         */
	        
	        ArrayList<Movie> movieList = new ArrayList<>();
	        movieList.add(movie1);
	        movieList.add(movie2);
	        movieList.add(movie3);
	        movieList.add(movie4);
	        /*
	         * A List of all the movie objects that will be iterated through
	         */
	        //quickSort(array, 0, array.length - 1);
	        
	        System.out.println("What is your favourite movie genre?");
	        String favGenre = scanner.nextLine();//User will input their favourite genre
	        for(Movie m : ActivitySelection(favGenre,movieList)) //Calls the greedy algorithm method and iterate through the list 
	        {
	        	System.out.println(m.getTitle()); //print out all the movies based of the user's favourite genre
	        }
	        }
	        
	       
	        
	    

//		private static void quickSort(int[] array, int start, int end) {
//			
//			if(end <= start) return; //base case
//			
//			int pivot = partition(array, start, end);
//			quickSort(array, start, pivot - 1);
//			quickSort(array, pivot + 1, end);		
//		}
//		private static int partition(int[] array, int start, int end) {
//			
//			int pivot = array[end];
//			int i = start - 1;
//			
//			for(int j = start; j <= end; j++) {
//				if(array[j] < pivot) {
//					i++;
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//			i++;
//			int temp = array[i];
//			array[i] = array[end];
//			array[end] = temp;
//			
//			return i;
//		}
	   
		 public static ArrayList<Movie> ActivitySelection(String key, ArrayList<Movie>list)
	        {
	           ArrayList<Movie> sel_act = new ArrayList<>();
	           	
	           for(int i = 0; i<list.size(); i++)
	                if(list.get(i).getGenre().contains(key)) {
	                	sel_act.add(list.get(i));
	                }
	                return sel_act;
	            }
	        }
				/*
				 * @param key- the user's genre, list- the list of movies in the database
				 * Method will iterate through the list that we pass down and see if the value at the current index matches the genre given by the user
				 * if it's true, the object is then put into a new arrayList and it returns the list
				 */



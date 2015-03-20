import java.util.Collections;
import java.util.List;


public class SortList 
{
	
	public static void sort(List<PersonAndBussiness>> list)
	{
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
	}

}

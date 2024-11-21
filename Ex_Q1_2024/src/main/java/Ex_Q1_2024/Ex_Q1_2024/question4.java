package Ex_Q1_2024.Ex_Q1_2024;

public class question4 {

	public static String compare(int A , int B , String mod) {
		switch (mod) {
		case "regular":
			if(A < B)
				return "B";
			else
				return "A";
			
		case "negative":
			if(-A < -B)
				return "B";
			else
				return "A";
		}
		return mod;
}
	public static String compare(float A , float B , String mod) {
		switch (mod) {
		case "inverse":			
		if(1/A > 1/B)
			return "A";
		else
			return "B";
	}
		return mod;
	}

}
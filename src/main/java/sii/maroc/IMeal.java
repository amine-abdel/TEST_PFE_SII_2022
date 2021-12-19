package sii.maroc;

import java.util.Hashtable;

public interface IMeal {
	static Hashtable<String, Integer> ht1 = new Hashtable<String, Integer>() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put("Tomato Mozzarella Salad", 6);
			put("pizza", 10);

		}
	};
}

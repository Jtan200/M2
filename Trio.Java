import java.util.Arrays;
/*
 * Group members: Chris G (Section 932), Jacky Tan (Section 931) , Raymond Lei (Section 931), Trang Hoang (Section 933)
 */
public class Trio<T> {
	private T item1;
	private T item2;
	private T item3;
	
	//Constructors
	public Trio(T item1, T item2, T item3) {
		this.item1 = item1; 
		this.item2 = item2;
		this.item3 = item3;
	}
	public Trio(T item) {
		this(item, item, item);
	}
	
	//getters and setters
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	public void setItem3(T item3) {
		this.item3 = item3;
	}
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public T getItem3() {
		return item3;
	}
	
	//toString method
	public String toString() {
		return item1 + " " + item2 + " " + item3;
	}
	
	//replaceAll method
	public void replaceAll(T item) {
		item1 = item;
		item2 = item;
		item3 = item;
	}
	
	//hasDuplicates method
	public boolean hasDuplicates() {
		boolean hasDuplicates = false;
		
		//checks duplicate items
		if (item1.equals(item2) || item1.equals(item3) || item2.equals(item3)) {
			hasDuplicates = true;
		}
		return hasDuplicates;
	}
	
	//count method
	public int count(T item) {
		int count = 0;
		
		//compares item object
		if (item.equals(item1)) {
			count++;
		}
		if (item.equals(item2)) {
			count++;
		}
		if (item.equals(item3)) {
			count++;
		}
		return count;
	}
	
	//equals method
	@Override
	public boolean equals(Object trio) {
		boolean equals = false;
		
		if(trio instanceof Trio<?>) {
			Trio<?> otherTrio = (Trio<?>) trio;
			//initialize arrays, sort them alphabetically or numerically, finally compare the index(s)
			Object[] trioArray = {item1, item2, item3};
			Object[] otherTrioArray = {otherTrio.item1, otherTrio.item2, otherTrio.item3};
			Arrays.sort(trioArray);
			Arrays.sort(otherTrioArray);
			if (trioArray[0].equals(otherTrioArray[0]) && trioArray[1].equals(otherTrioArray[1]) && trioArray[2].equals(otherTrioArray[2])) {
					return equals = true; 
			}
		}
		return equals;
	}
}	

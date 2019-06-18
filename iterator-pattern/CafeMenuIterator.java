import java.util.Hashtable;

public class CafeMenuIterator implements Iterator {
	Hashtable items;
	java.util.Iterator<String> iterator;

	public CafeMenuIterator(Hashtable items) {
		this.items = items;
		this.iterator = items.keySet().iterator();
	}

	public Object next() {
		//String name = (String)items.keySet().iterator().next();
		//MenuItem menuItem = (MenuItem)items.get(name);
		return (MenuItem)items.get(((String)iterator.next()));
	}

	public boolean hasNext() {
		return iterator.hasNext();
	}
}

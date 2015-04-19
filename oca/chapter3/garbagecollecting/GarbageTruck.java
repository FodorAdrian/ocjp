public class GarbageTruck {
	public static void main(String[] args) {
		// 1)
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		// sb nie kwalifikuje si� jeszcze do od�miecenia
		sb = null;
		// teraz GC mo�e usun�� obiekt z pami�ci
		
		// 2)
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("goodbye");
		System.out.println(s1);
		// s1 nie kwalifikuje si� jeszcze do od�miecenia
		s1 = s2;
		// teraz GC mo�e usun�� obiekt z pami�ci
		
		// 3)
		Date d = getDate();
		// rob cos...
		System.out.println("d = " + d);
	}
	
	public static Date getDate() {
		Date d2 = new Date();
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println(now);
		// obiekt StringBuffer kwalifikuje sie do od�miecania
		// po wywo�aniu metody
		return d2;
		// obiekt Date nie kwalifikuje si� do od�miecania
		// - referencja jest zwracana po powrocie
		// i u�ywana dalej (nie jest zerowana)
	}
}
package player;

public class withoutloop {
public static void recursivefun(int n){
	if(n>=1){
		System.out.println(n);
		recursivefun(n+1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
recursivefun(1);
	}

}

package kadai11;

public class kadai11main {
	
	public static void main(String[] args) {
	
		
		Raichu r = new Raichu("ライ中",100,100,100);
		
		r.attack();
		r.defense();
		r.thunderAttack();
		
		Charmander c = new Charmander("ヒトカゲ",50,50,50);
		
		c.attack();
		c.defense();
		c.fireAttack();
		
		Heatrotom h = new Heatrotom("ヒートロトム",80,130,50);
		
		h.attack();
		h.defense();
		h.thunderAttack();
		h.fireAttack();
		
	}

}

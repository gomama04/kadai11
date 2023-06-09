package kadai11;

public class Charmander implements FirePokemon {
	  private String name;
	  private int hp;
	  private int at;
	  private int df;

	  public Charmander(String name, int hp, int at, int df) {
	    this.name = name;
	    this.hp = hp;
	    this.at = at;
	    this.df = df;
	  }

	  @Override
	  public void attack() {
	    System.out.println(this.name + "の攻撃");
	    System.out.println(this.at + "のダメージ");
	  }

	  @Override
	  public void defense() {
	    System.out.println(this.name + "は守りを固めた");
	    this.df += 10;
	    System.out.println("防御力が10上昇し、" + this.df + "になった");
	  }

	  @Override
	  public void fireAttack() {
	    System.out.println(this.name + "の炎攻撃");
	    System.out.println(this.at + "のダメージ");
	  }
	}

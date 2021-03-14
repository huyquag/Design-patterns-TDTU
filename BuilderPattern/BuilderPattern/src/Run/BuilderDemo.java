package Run;

public class BuilderDemo {
	public static void main(String args[]) {
		CDBuilder Builderr = new CDBuilder();

		CDType type11 = Builderr.buildAppleCD();
		type11.show();

		CDType type22 = Builderr.buildSamsungCD();
		type22.show();
	}
}


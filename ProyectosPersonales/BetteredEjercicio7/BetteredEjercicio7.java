import java.util.HashMap;
public class BetteredEjercicio7 {
        static double currentIVA = 0.21; // (Current percentage of IVA)/100	
	static int i;
	static int numeroDeProductos;
	public static void main(String[] args) {
	 HashMap<Integer, Double> priceAndProduct = new HashMap<Integer, Double>();
		System.out.println("Please, specify the number of products");
	        numeroDeProductos = Integer.parseInt(System.console().readLine());
		for (i = 1; i <= numeroDeProductos; i++) {
			priceAndProduct.put(i,0.0);
		}
		System.out.println("Please, specify the price for all products");
		double precioDeProductos;
		for (i = 1; i <= numeroDeProductos; i++) {
			precioDeProductos = Double.parseDouble(System.console().readLine());
			priceAndProduct.put(i, precioDeProductos);
		}	
	double baseImponible = Sum(priceAndProduct);
	double iva = baseImponible * currentIVA;
	double total = baseImponible + iva;	
	System.out.printf("%.2f" + " eur" + " is your total\n", total);
	}
	public static double Sum(HashMap<Integer, Double> priceAndProduct) {
		double totalProduct;
		totalProduct = priceAndProduct.values().stream().mapToDouble(Double::valueOf).sum();
		return totalProduct;
}
}


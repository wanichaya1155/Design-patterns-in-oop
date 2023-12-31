public class PaymentController {
	private Pay paymentMethod;
	
	public void setPaymentMethod(Pay paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		paymentMethod.pay();
	}
}

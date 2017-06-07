import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

@Test
public void testWithSufficientFunds(){
 BankAccount account = new BankAccount(10);
 double amount = account.debit(5);
 Assert.assertEquals(5.0, amount);
}

@Test
public void testWithInSufficientFunds(){
 BankAccount account = new BankAccount(10);
 double amount = account.debit(11);
 Assert.assertEquals(10.0, amount);
}

}

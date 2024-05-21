package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controllers.customers.AddCustomerController;
import controllers.customers.DeleteCustomerController;
import controllers.customers.ListingCustomersController;
import controllers.payments.PaymentController;
import controllers.payments.ReceivingPaymentController;

public class MainFrameController {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

        mainFrame.addCustomerMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddCustomerController controller=new AddCustomerController(mainFrame);
                controller.execute();
            }
        });

        mainFrame.deleteCustomerMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeleteCustomerController controller=new DeleteCustomerController(mainFrame);
                controller.execute();
            }
        });


        mainFrame.listCustomersMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListingCustomersController controller=new ListingCustomersController(mainFrame);
                controller.execute();
            }
        });

        mainFrame.paymentMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PaymentController controller=new PaymentController(mainFrame);
                controller.execute();
            }
        });

        mainFrame.receivingPaymentsMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReceivingPaymentController controller=new ReceivingPaymentController(mainFrame);
                controller.execute();
            }
        });

        mainFrame.remainingPaymentsMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RemainingPaymentsController controller=new RemainingPaymentsController(mainFrame);
                controller.execute();
            }
        });

    }
}

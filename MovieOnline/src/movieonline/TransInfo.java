package movieonline;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TransInfo implements java.io.Serializable{
    /*
    TransInfo class is define bank account's transfer record.
    sendAccName = send money account name
    receiveAccName = receive money account name
    transAmount = transfer money amount
    timestamp = transfer time
    */
    int sendAccName;
    int receiveAccName;
    int transAmount;
    Timestamp timestamp;


    TransInfo() { }

    TransInfo(int sendAccName, int receiveAccName, int transAmount) {
        this.sendAccName = sendAccName;
        this.receiveAccName = receiveAccName;
        this.transAmount = transAmount;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        String time = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(this.timestamp);
        return String.format("Sent Account: %d,\n Received Account: %d,\n Amount: %d,\n Time: %s", sendAccName, receiveAccName, transAmount, time);
    }
}

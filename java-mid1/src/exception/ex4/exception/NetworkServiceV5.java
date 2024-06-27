package exception.ex4.exception;



import exception.ex4.NetworkClientV4;
import exception.ex4.NetworkClientV5;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try(NetworkClientV5 client = new NetworkServiceV5(address)) {
            client.connect();
            client.send(data);
        } catch (Exception e){
            System.out.println("[예외확인]: " + e.getMessage());
            throw e;
        }


    }

}

package honjo2.ipmessenger_sender;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class Main {

	private DatagramSocket socket;

	public Main() throws Exception {
		socket = new DatagramSocket(2425);
	}

	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			throw new IllegalArgumentException("[message host host host ...]");
		}
		Main main = new Main();
		for (int i = 1; i < args.length; i++) {
			main.send(args[i], args[0]);
		}
	}

	public void send(String host, String message) throws Exception {
		final String ipMessage = "1:" + new Date().getTime() / 1000
				+ ":IPMessengerClient:" + host + ":32:" + message;
		byte[] byteMsg = ipMessage.getBytes("MS932");
		DatagramPacket packet = new DatagramPacket(byteMsg, byteMsg.length,
				InetAddress.getByName(host), 2425);
		socket.send(packet);
	}
}

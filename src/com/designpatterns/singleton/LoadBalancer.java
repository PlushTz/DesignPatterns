//designpatterns.singleton.LoadBalancer.java
package designpatterns.singleton;
import java.util.*;

//���ؾ������࣬�䵱������ɫ
public class LoadBalancer {
	//˽�о�̬��Ա�������洢Ψһʵ��
	private static LoadBalancer instance = null;
	//����������
	private List serverList = null;
		
	//˽�й��캯��
	private LoadBalancer() {
		serverList = new ArrayList();
	}
		
	//���о�̬��Ա����������Ψһʵ��
	public static LoadBalancer getLoadBalancer() {
		if (instance == null) {
			instance = new LoadBalancer();
		}
		return instance;
	}
		
	//���ӷ�����
	public void addServer(String server) {
		serverList.add(server);
	}
		
	//ɾ��������
	public void removeServer(String server) {
		serverList.remove(server);
	}
		
	//ʹ��Random�������ȡ������
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String)serverList.get(i);
	}
}
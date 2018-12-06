package com.zjw;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class LocalIP {

  public static void main(String[] args) throws Exception {
    getIPAndHostname();
    System.out.println("====");
    getAllIPs();
  }

  static void getIPAndHostname() throws Exception {
    InetAddress addr = InetAddress.getLocalHost();
    System.out.println("Local HostAddress: " + addr.getHostAddress());
    String hostname = addr.getHostName();
    System.out.println("Local host name: " + hostname);
  }


  static void getAllIPs() throws Exception {
    Enumeration<NetworkInterface> interfaces = null;
    interfaces = NetworkInterface.getNetworkInterfaces();
    while (interfaces.hasMoreElements()) {
      NetworkInterface ni = interfaces.nextElement();
      Enumeration<InetAddress> addresss = ni.getInetAddresses();
      while (addresss.hasMoreElements()) {
        InetAddress nextElement = addresss.nextElement();
        String hostAddress = nextElement.getHostAddress();
        System.out.println("本机IP地址为：" + hostAddress);
      }
    }
  }
}

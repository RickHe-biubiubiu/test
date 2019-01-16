package cn.hcl.test;

/**
 * 获取电脑分辨率
 * @author hcl
 *
 */
public class Screen {

	public static void main(String[] args) {
		// int screenWidth=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		// int screenHeight=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		ScreenSize ss=new ScreenSize();
		int screenWidth=ss.getScreenWidth();
		int screenHeight=ss.getScreenHeight();
		System.out.println("屏幕宽为："+screenWidth+"---屏幕高为："+screenHeight);
	}

}



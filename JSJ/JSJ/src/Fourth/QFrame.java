/**
 * 
 */
package Fourth;

import java.awt.event.*;

import javax.swing.*;

/**
 * @Description 可视化界面
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月28日下午8:00:41
 */
public class QFrame extends JFrame
{
	public QFrame()
	{
		JButton jbtNew = new JButton("New");
		JButton jbtMan = new JButton("男");
		JButton jbtWomen = new JButton("女");
		JPanel panel = new JPanel();
		panel.add(jbtNew);
		panel.add(jbtMan);
		panel.add(jbtWomen);
		add(panel);

		jbtNew.addActionListener(new ActionListener()
		{
			// 新建一个匿名类，并将该类对应的事件监听器注册到“新建”按钮jbtNew上
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "单击了新建按钮");
				System.out.println("Process new");
			}
		});
		
		jbtMan.addActionListener(new ActionListener()
		{
			// 新建一个匿名类，并将该类对应的事件监听器注册到“新建”按钮jbtNew上
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "单击了男按钮");
				System.out.println("Process Man");
			}
		});
		
		jbtWomen.addActionListener(new ActionListener()
		{
			// 新建一个匿名类，并将该类对应的事件监听器注册到“新建”按钮jbtNew上
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "单击了女按钮");
				System.out.println("Process Women");
			}
		});
	}

	public static void main(String[] args)
	{
		JFrame frame = new QFrame();
		//frame.setTitle("QFrame");
		frame.setTitle("性别");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}

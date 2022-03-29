package pages;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;

import IO.*;
import services.Book;
import services.ButtonFunction;
import services.LendRelationship;
import services.Student;

import static IO.LendHistoryIO.ReturnLendHistory;

public class CardUI {
	public static int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public static int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	public static int WindowWidth = 240;
	public static int WindowHeight = 200;
	static Student student = new Student();
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		JFrame jf = new JFrame("图书管理系统");
		JPanel UserPanel = new JPanel(); //用户端

		MinePanel minePanel = new MinePanel(); //我的子页面
		BookSearcherPanel BookSearcherPanel = new BookSearcherPanel(); //图书搜索页面
		LendHistoryPanel LendHistoryPanel = new LendHistoryPanel(); //借阅历史子页面
		LendBookPanel LendBookPanel = new LendBookPanel(); //借阅书籍子页面

		JPanel AdminPanel = new JPanel(); //管理员端
		AdminMenuPanel AdminMenu = new AdminMenuPanel();
		AdminAddBookPanel AdminAddBookPanel = new AdminAddBookPanel();//添加书籍子页面
		AdminManageUsersPanel AdminManageUser = new AdminManageUsersPanel();//管理用户子页面


		JPanel cards = new JPanel(new CardLayout(10,15));
		JLabel UserLogin = new JLabel("账号:");
		UserPanel.add(UserLogin);
		JTextField UserLoginText = new JTextField(15);
		UserPanel.add(UserLoginText);
		JLabel UserPasswd = new JLabel("密码:");
		UserPanel.add(UserPasswd);
		JTextField UserPasswdText = new JTextField(15);
		UserPanel.add(UserPasswdText);
		JButton UserloginButton = new JButton("登录");
		UserPanel.add(UserloginButton);
		JButton UserRegisterButton = new JButton("注册");
		UserPanel.add(UserRegisterButton);
		JButton SwitchButton = new JButton("我是管理员");
		UserPanel.add(SwitchButton);
		JLabel AdminLogin = new JLabel("账号:");
		AdminPanel.add(AdminLogin);
		JTextField AdminLoginText = new JTextField(15);
		AdminPanel.add(AdminLoginText);
		JLabel AdminPasswd = new JLabel("密码:");
		AdminPanel.add(AdminPasswd);
		JTextField AdminPasswdText = new JTextField(15);
		AdminPanel.add(AdminPasswdText);
		JButton AdminLoginButton = new JButton("登录");
		AdminPanel.add(AdminLoginButton);
		JButton AdminRegisterButton = new JButton("注册");
		AdminPanel.add(AdminRegisterButton);

		CardLayout CardSwitch = (CardLayout)(cards.getLayout());
		CardSwitch.show(cards,"User");

		SwitchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwitchButton.setText("我是用户");
				AdminPanel.add(SwitchButton);
				CardSwitch.show(cards,"Admin");
			}
		});
		UserloginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String LoginName = UserLoginText.getText();
				String LoginPassword = UserPasswdText.getText();
				try {
					int stu_id = ButtonFunction.UserCheck(LoginName,LoginPassword);
					if(stu_id !=0){
						student = ButtonFunction.ReturnStudentData(stu_id);

						JOptionPane.showMessageDialog(null,"登陆成功");
						CardSwitch.show(cards,"UserMenu");
					}else {
						JOptionPane.showMessageDialog(null,"密码或账户错误！");
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		});
		System.out.println(student.toString());


		UserMenu UserMenuPanel = new UserMenu(); //用户主界面
		//我的按钮监听
		UserMenuPanel.Mine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				minePanel.backButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"UserMenu");
					}
				});
				minePanel.nameLabel.setText("用户："+ student.getName());
				minePanel.ageLabel.setText("年龄："+Integer.toString (student.getAge()));
				minePanel.lendLabel.setText("借阅数量"+Integer.toString(student.getLendBooks()));
				cards.add(minePanel,"mine");
				CardSwitch.show(cards,"mine");
			}
		});

		//书籍查询按钮监听
		UserMenuPanel.BookSearcherButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				BookSearcherPanel.BackButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"UserMenu");
					}
				});
				cards.add(BookSearcherPanel,"booksearch");
				CardSwitch.show(cards,"booksearch");
				jf.setBounds((width-500)/2, (height-480)/2,500,480);
			}
		});
		//书籍查询页面搜索按钮监听
		BookSearcherPanel.SearchButton.addActionListener(new ActionListener(){
			String[] name ={"书号","书名","分类"};
			String[][] comm=null;

			@Override
			public void actionPerformed(ActionEvent e) {
				String InputText = BookSearcherPanel.SearchField.getText();
				try {
					if(InputText.equals("")){
						System.out.println("空");
						comm= BookIO.ReturnBooksData();
					}else {
						System.out.println(InputText);
						comm= BookIO.ReturnBooksData(InputText);
					}

				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
				BookSearcherPanel.Update(comm,name);
			}
		});
		//借阅历史查询监听
		String [] name = {"借阅编号","学生学号","书号","书名","学生姓名","借阅时间"};
		UserMenuPanel.LendHistoryButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				LendHistoryPanel.BackButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"UserMenu");
					}
				});
				String comm[][] =null;
				try {
					comm = ReturnLendHistory();
					for (int i=0; i<comm.length; i++)
					System.out.println(Arrays.toString(comm[i]));
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
				LendHistoryPanel.Update(comm,name);

				cards.add(LendHistoryPanel,"LendHistory");
				CardSwitch.show(cards,"LendHistory");


				jf.setBounds((width-540)/2, (height-480)/2,540,480);
			}
		});


		//借阅书籍监听
		UserMenuPanel.LendBookButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				LendBookPanel.BackButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"UserMenu");
					}
				});
				cards.add(LendBookPanel,"LendBook");
				CardSwitch.show(cards,"LendBook");
				jf.setBounds((width-280)/2, (height-480)/2,280,480);

			}
		});
		//借阅书籍页面提交按钮监听
		LendBookPanel.UploadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int stu_id = Integer.parseInt(LendBookPanel.StuIdText.getText());
				int Book_id = Integer.parseInt(LendBookPanel.BookIdText.getText());
				String Book_name = LendBookPanel.BookNameText.getText();
				String name = LendBookPanel.StuNameText.getText();
				Date date = Date.valueOf(LendBookPanel.DateText.getText());
				LendRelationship lendRelationship = LendRelationship.getInstance();
				lendRelationship.setStu_id(stu_id);
				lendRelationship.setBook_id(Book_id);
				lendRelationship.setStu_name(name);
				lendRelationship.setBook_name(Book_name);
				lendRelationship.setDate(date);
				try {
					LendRelationshipIO.SaveLendRelationship();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"提交成功");
			}
		});

		/**
		 * 管理员界面
		 */
		//管理员登录按钮监听
		AdminLoginButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String AdminLoginName = AdminLoginText.getText();
				String AdminLoginPasswd = AdminPasswdText.getText();

				try {
					int admin_id = ButtonFunction.AdminCheck(AdminLoginName,AdminLoginPasswd);
					if(admin_id !=0){

						JOptionPane.showMessageDialog(null,"登陆成功");
						CardSwitch.show(cards,"AdminMenu");
					}else {
						JOptionPane.showMessageDialog(null,"密码或账户错误！");
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		});
		//管理端添加书籍按钮监听
		AdminMenu.addBookButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				cards.add(AdminAddBookPanel,"AdminAddBook");
				AdminAddBookPanel.backButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"AdminMenu");
					}
				});
				CardSwitch.show(cards,"AdminAddBook");
				jf.setBounds((width-800)/2, (height-200)/2,800,200);
			}
		});
		AdminAddBookPanel.UploadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Book book = Book.getInstance();
				book.setBook_id(Integer.parseInt(AdminAddBookPanel.BookIdText.getText()));
				book.setBook_name(AdminAddBookPanel.BookNameText.getText());
				book.setClassify(AdminAddBookPanel.BookClassifyText.getText());
				try {
					if(BookSaveIO.BookSave() !=0){
						JOptionPane.showMessageDialog(null,"提交成功");
					}
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		//管理端管理用户
		AdminMenu.manageUsersButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				cards.add(AdminManageUser,"AdminManageUser");
				AdminAddBookPanel.backButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"AdminMenu");
					}
				});
				CardSwitch.show(cards,"AdminManageUser");
				jf.setBounds((width-800)/2, (height-400)/2,800,400);
			}
		});
		//管理端管理用户查询所有用户子页面
		AdminManageUser.SearchAllUsersButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AdminManageUser.BackButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CardSwitch.show(cards,"AdminMenu");
					}
				});
				String comm[][] =null;
				String [] name = {"学生学号","学生姓名","年龄"};
				try {
					comm = UserIO.ReturnUserData();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
				AdminManageUser.Update(comm,name);
			}
		});
		AdminManageUser.DeleteUsersButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int stu_id = Integer.parseInt(AdminManageUser.InputText.getText());
				try {
					if(DeleteUserIO.DeleteUser(stu_id)!=0){
						JOptionPane.showMessageDialog(null,"删除成功");
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		});

		cards.add(UserPanel,"User");
		cards.add(AdminPanel,"Admin");
		cards.add(UserMenuPanel,"UserMenu");
		cards.add(AdminMenu,"AdminMenu");

		jf.add(cards);
		jf.setBounds((width-WindowWidth)/2, (height-WindowHeight)/2,WindowWidth,WindowHeight);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

//用户主界面
class UserMenu extends JPanel{
	JButton BookSearcherButton = new JButton("图书查询");
	JButton LendHistoryButton = new JButton("借阅历史");
	JButton LendBookButton = new JButton("借阅图书");
	JButton Mine = new JButton("我的");
	UserMenu(){
		add(BookSearcherButton);
		add(LendHistoryButton);
		add(LendBookButton);
		add(Mine);
	}
}

//用户主界面-我的子页面
class MinePanel extends JPanel{
	JLabel nameLabel = new JLabel("用户：");
	JLabel ageLabel = new JLabel("年龄：");
	JLabel lendLabel = new JLabel("借阅数量:");
	JButton backButton = new JButton("返回");
	MinePanel(){
		new BorderLayout();
		add(nameLabel);
		add(ageLabel);
		add(lendLabel);
		add(backButton);
	}
}

//用户主界面-书籍搜索子页面
class BookSearcherPanel extends JPanel{
	JTextField SearchField = new JTextField(30);
	JButton SearchButton = new JButton("搜索");
	JButton BackButton = new JButton("返回");
	JTable BookTable = new JTable();
	String [] name = {"书号","书名","分类"};
	BookSearcherPanel(){
		add(SearchField);
		add(SearchButton);
		add(BackButton);
		add(BookTable);

	}
	public void Update(String [][] rowData, String [] Title){
		TableModel datamodel = new DefaultTableModel(rowData,Title);
		BookTable.setModel(datamodel);
	}
}


//用户主页面-借阅历史子页面
class LendHistoryPanel extends JPanel{
	JLabel TitleLabel = new JLabel("借阅书籍历史");
	JTable LendHistoryTable = new JTable();
	JButton BackButton = new JButton("返回");
	LendHistoryPanel(){
		add(TitleLabel);
		add(LendHistoryTable);
		add(BackButton);
	}

	public void Update(String [][] rowData, String [] Title){
		TableModel datamodel = new DefaultTableModel(rowData,Title);
		LendHistoryTable.setModel(datamodel);
	}
}

//用户子页面-借阅子页面
class LendBookPanel extends JPanel{
	JLabel StuLabel = new JLabel("学生学号：");
	JTextField StuIdText = new JTextField(20);
	JLabel BookIdLabel = new JLabel("书籍编号：");
	JTextField BookIdText = new JTextField(20);
	JLabel BookNameLabel = new JLabel("书名：");
	JTextField BookNameText = new JTextField(20);
	JLabel StuNameLabel = new JLabel("学生姓名");
	JTextField StuNameText = new JTextField(20);
	JLabel DateLabel = new JLabel("借阅日期");
	JTextField DateText = new JTextField(20);
	JButton UploadButton = new JButton("提交");
	JButton BackButton = new JButton("返回");
	LendBookPanel(){
		add(StuLabel);
		add(StuIdText);
		add(BookIdLabel);
		add(BookIdText);
		add(BookNameLabel);
		add(BookNameText);
		add(StuNameLabel);
		add(StuNameText);
		add(DateLabel);
		add(DateText);
		add(UploadButton);
		add(BackButton);
	}
}

//管理端菜单
class AdminMenuPanel extends JPanel{
	JButton addBookButton = new JButton("添加书籍");
	JButton manageUsersButton = new JButton("管理用户");
	AdminMenuPanel(){
		add(addBookButton);
		add(manageUsersButton);
	}
}

//管理端-添加书籍页面
class AdminAddBookPanel extends JPanel{
	JLabel BookIdLabel = new JLabel("书籍编号:");
	JTextField BookIdText = new JTextField(15);
	JLabel BookNameLabel = new JLabel("书名:");
	JTextField BookNameText = new JTextField(15);
	JLabel BookClassify = new JLabel("书籍分类:");
	JTextField BookClassifyText = new JTextField(15);
	JButton UploadButton = new JButton("提交:");
	JButton backButton = new JButton("返回");
	AdminAddBookPanel(){

		add(BookIdLabel);
		add(BookIdText);
		add(BookNameLabel);
		add(BookNameText);
		add(BookClassify);
		add(BookClassifyText);
		add(UploadButton);
		add(backButton);
	}
}

class AdminManageUsersPanel extends JPanel{
	JButton SearchAllUsersButton = new JButton("查询所有用户");
	JTextField InputText = new JTextField(15);
	JButton DeleteUsersButton = new JButton("删除用户");
	JTable UserTable = new JTable();
	String [] name = {"学生学号","学生姓名","年龄"};
	JButton BackButton = new JButton("返回");
	AdminManageUsersPanel(){
		add(SearchAllUsersButton);
		add(InputText);
		add(DeleteUsersButton);
		add(UserTable);
		add(BackButton);
	}
	public void Update(String [][] rowData, String [] Title){
		TableModel datamodel = new DefaultTableModel(rowData,Title);
		UserTable.setModel(datamodel);
	}
}
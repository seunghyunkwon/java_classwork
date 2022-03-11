package project;

import project.vo.G_Group;

public class ProjectMain {
		public static void main(String[] args) {
			G_Group t_name = G_GroupDao.selectOne("TWICE");
			System.out.println(t_name);
			
		}
	
}

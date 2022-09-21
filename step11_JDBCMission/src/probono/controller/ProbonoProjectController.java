package probono.controller;

import java.sql.SQLException;

import probono.model.ActivistDAO;
import probono.model.ProbonoDAO;
import probono.model.ProbonoProjectDAO;
import probono.model.dto.ProbonoProjectDTO;
import probono.view.RunningEndView;

//�� ���� : view.RunningStrartView���� ȣ�� 
public class ProbonoProjectController {

	// ��� ������Ʈ �˻� ����
	public static void getAllProbonoProjects() {
		try {
			RunningEndView.projectListView(ProbonoProjectDAO.getAllProbonoProjects());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("��� ������Ʈ �˻��� ���� �߻�");
		}
	}

	// ���ο� ������Ʈ ���� ����
	public static boolean addProbonoProject(ProbonoProjectDTO probonoProject) {
		boolean result = false;

		try {
			result = ProbonoProjectDAO.addProbonoProject(probonoProject);
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("��� ������Ʈ ����� ���� �߻�");
		}
		return result;
	}

	// ��� ������Ʈ �˻� ����
	public static void getAllActivists() {
		try {
			RunningEndView.activistListView(ActivistDAO.getAllActivists());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("��� ��� ����� �˻��� ���� �߻�");
		}
	}

	// ���κ��� ���̵�� ���κ��� ���� ����
	public static boolean updateProbono(String probonoId, String probonoPurpose) {
		boolean result = false;
		try {
			result = ProbonoDAO.updateProbono(probonoId, probonoPurpose);
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("���κ��� id�� ���κ��� ���� ���� ����");
		}
		return result;
	}

	// ���κ��� ���� �˻�
	public static void getProbono(String probonoId) {
		try {
			RunningEndView.allView(ProbonoDAO.getProbono(probonoId));
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("���κ��� id�� �ش� ���κ��� �˻� ���� ");
		}
	}
}
package probono.controller;

import probono.model.ActivistDAO;
import probono.model.ProbonoDAO;
import probono.model.ProbonoProjectDAO;
import probono.model.entity.ProbonoProjectDTO;
import probono.view.RunningEndView;

public class ProbonoProjectController {

	// ��� ������Ʈ �˻� ����
	public static void getAllProbonoProjects() {
		try {
			RunningEndView.projectListView(ProbonoProjectDAO.getAllProbonoProjects());
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("��� ������Ʈ �˻� �� ���� �߻�");
		}
	}

	// ���ο� ������Ʈ ���� ����
	public static void addProbonoProject(ProbonoProjectDTO probonoProject) {
		try {
			ProbonoProjectDAO.addProbonoProject(probonoProject);
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("��� ������Ʈ ���� �� ���� �߻�");
		}
	}

	// ��� ����� �˻� ����
	public static void getAllActivists() throws Exception {
		try {
			RunningEndView.activistListView(ActivistDAO.getAllActivists());
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("��� ��� ����� �˻� �� ���� �߻�");
		}
	}

	// ���κ��� ���̵�� ���κ��� ���� ����
	public static void updateProbono(String probonoId, String probonoPurpose) {
		try {
			ProbonoDAO.updateProbono(probonoId, probonoPurpose);
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("���κ��� id�� ���κ��� ���� ���� ����");
		}
	}

	// ���κ��� ���� �˻�
	public static void getProbono(String probonoId) {
		try {
			RunningEndView.allView(ProbonoDAO.getProbono(probonoId));
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("���κ��� id�� �ش� ���κ��� �˻� ���� ");
		}
	}
}
package com.tarena.fly;
/**
 * ����
 */
public interface Award {
	int DOUBLE_FIRE = 0;  //˫������
	int LIFE = 1;   //1����
	int Death = 2;
	/** ��ý�������(�����0��1) */
	int getType();
}

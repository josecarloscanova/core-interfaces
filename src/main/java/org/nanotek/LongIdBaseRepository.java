package org.nanotek;

import org.nanotek.Base;

public interface LongIdBaseRepository <T extends Base<Long>> {

	T findById(Long id);
	
}

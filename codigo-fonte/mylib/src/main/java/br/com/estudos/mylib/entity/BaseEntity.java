package br.com.estudos.mylib.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class BaseEntity<I extends Serializable>  implements IBaseEntity<I>{
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + Objects.hashCode(getId());
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final BaseEntity<?> other = (BaseEntity<?>) obj;
		return Objects.equals(getId(), other.getId());
	}
	
}

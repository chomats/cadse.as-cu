package fr.imag.adele.cadse.core;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import fr.imag.adele.emf.cadse.ccore.Cadse;

public interface CPackage extends INamedUUID, INamed, Cadse {
	
	interface CRegistry {

		CRegistry	INSTANCE	= new CRegistry() {

			private Map<UUID, CPackage>	_map = new HashMap<UUID, CPackage>();

			@Override
			public CPackage get(UUID uuid) {
				return _map .get(uuid);
			}

			@Override
			public CPackage getCPackage(UUID uuid) {
				return get(uuid);
			}

			@Override
			public void put(UUID uuid, CPackage p) {
				_map.put(uuid, p);
			}

		};

		CPackage getCPackage(UUID uuid);

		CPackage get(UUID uuid);

		void put(UUID uuid, CPackage theEcorePackage);
		
	}
	CFactory getCFactory();

	void addTypeDefintion(TypeDefinition ret);

	
}

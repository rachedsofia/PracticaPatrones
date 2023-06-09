package ejercicio1;

import java.time.LocalDateTime;

public class PorCacheObtenerClima implements Clima {

	private Clima miClima;
	private String estadoDelDiaCache;
	private LocalDateTime tiempoCache;

	public PorCacheObtenerClima(Clima miClima) {
		this.miClima = miClima;
		this.tiempoCache = LocalDateTime.now();
	}

	@Override
	public String estadoDelDia() {

		if ((estadoDelDiaCache == null) || (LocalDateTime.now().isAfter(this.tiempoCache.plusSeconds(1)))) {
			this.estadoDelDiaCache = miClima.estadoDelDia();
		}
		return this.estadoDelDiaCache;

	}
}

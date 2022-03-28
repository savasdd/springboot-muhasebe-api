package muhasebe.dto;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import muhasebe.util.MuhView;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MuhRolGrupKullaniciDto {

	@JsonView(MuhView.Public.class)
	private String rolGrupKullaniciId;

	@JsonView(MuhView.Public.class)
	private MuhRolGrupDto grup;

	@JsonView(MuhView.Public.class)
	private MuhKullaniciDto kullanici;

}

Dados:
	21703860 Pedro Nogueira
	21804816 Ricardo Cunha
	
Nomes dos Filmes:
	The Shawshank Redemption
	The Godfather
	he Dark Knight
	Pulp Fiction
	The Silence of the Lambs
	Inception
	Interstellar
	The Matrix
	The Prestige
	Blade Runner
	
  
Itens a verde são os existentes na app

![image](https://user-images.githubusercontent.com/43844932/234086064-a02aa01b-5d10-4b9d-8213-6dd0546f360d.png)


Previsão da nota 16

class Filme(
    var nomeFilme: String,
    var nomeCinema: String,
    var avaliacao: String,
    var dataVisualizacao: String,
    var observacoes: String,
    var novasFotografias: List<String>,
    var imagemCartaz: Int,
    var genero: String,
    var sinopse: String,
    var dataLancamento: String,
    var avaliacaoImdb: String,
    var linkImdb: String,
    var avaliado: Boolean,
    val uuid: String = UUID.randomUUID().toString(),
    var paraVer: Boolean = false

) {
    fun substituirFotografias- para substituir as fotografias que são tiradas pelo utilizador 
}

registarFilme -valida campos e ve se existe na lista total
filmesVistos- ver se o filme está nos vistos
verificarNomeFilme
percorrerFilmes
verificarNomeCinema
adicionarListaVistos
editOperation
getOperationById
updateData
setCalendario
limparCampos  
alterarAvaliacao
verificarData
verificarNomeCinema

	
Chat gpt, stack overflow e youtube foram usados para fazer varios pedaços de codigo, o botão de pesquisa por voz, ter duas images views horizontal numa lista, criar uma bottom navigation, if para fazer desaparecer partes do xml.
	
Temos a funcionalidad extra que é o utilizador pode ir à página de detalhes e pode introduzir um filme como querer ver mais tarde ou seja filmes que ainda não viu pode carregar neles na dashboard e carregar no botão no canto superior direito em que lhe é possivel adicionar a uma lista de filmes para ver mais tarde e ate editar, e depois pode vizualizar essa lista atraves da bottom navigation 
Também é possivel pesquisar os filmes usando o floating button para pesquisar por voz

	
Screenshots
Splashscreen

![splashscreen](https://user-images.githubusercontent.com/43844932/234120129-1cfa3920-6faf-47c7-9077-4e60a3b84444.jpg)

	
Dashboard-Sem existir registo de Filmes,é possivel ver duas listas uma de sugestões outra com os filmes ordenados por pontuação
	
![dashboard](https://user-images.githubusercontent.com/43844932/234120255-86dea59d-f91a-4825-933e-30e2df73af11.jpg)
	

Dashboard-Com registo de Filmes, uma lista de sugestões e a lista dos filmes vistos

![dashfilmes](https://user-images.githubusercontent.com/43844932/234120562-00e51987-6629-4273-a4b2-1001f0b7bff2.jpg)

	
![dashfilmes](https://user-images.githubusercontent.com/43844932/234120578-e168f082-3068-4fae-9ed9-5cc125b678aa.jpg)

	
Registo-Com Erro

![erroRegisto](https://user-images.githubusercontent.com/43844932/234120640-e612d2fa-fe8c-412b-953d-1af1ae235f55.jpg)

	
Registo-Confirmar
	
![registoConfirmar](https://user-images.githubusercontent.com/43844932/234120687-7922d0b9-89a0-4575-8f64-9b4129b52b23.jpg)

	
Lista Filmes Vistos

![listaVistos](https://user-images.githubusercontent.com/43844932/234120822-bbe9418a-a985-4cc4-8ffb-112bea8e5734.jpg)
	
Lista Filmes para Ver
	
![listsParaVer](https://user-images.githubusercontent.com/43844932/234120932-71031fff-707d-4f90-a4d8-13f91a7c20da.jpg)
	
Detalhes Filmes não Vistos
	
![darkNigth](https://user-images.githubusercontent.com/43844932/234121257-733ae0b3-0087-4c1c-9add-b1c43e5bad33.jpg)
	
Detalhes Filmes Vistos
	
![godfather](https://user-images.githubusercontent.com/43844932/234121054-1adb0bfa-bdd5-4e34-91ca-5bfb34e1c4af.jpg)





	

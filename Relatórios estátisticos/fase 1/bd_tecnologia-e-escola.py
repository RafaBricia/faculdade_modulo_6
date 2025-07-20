import pandas as pd


data_prof = {
        "Situação - uso de tecnologias": [
            "Possui internet a domicílio",
            "Preparação de aula",
            "Realização de tarefas administrativas da escola","",
            "Resolver questões de","","","","","","","","","Avaliar o desempenho dos alunos "
            ],
        "situação secundária": ["", "","diário de classe,relatórios,notas(organização),etc","Produzir conteúdos, como apresentações,textos,vídeos,etc","programação e desenvolvimento de tecnologias","","Recursos matemáticos e científicos","","","Produção textual","","Produção multimídia","",""],
        "detalhamento":["","","","",
                        "criar e produzir modelos computacionais,de programação ou IA",
                        "criar projetos 3D ou experiência com realidade virtual ou aumentada",
                        "utilizar conceitos matemáticos ou geométricos",
                        "realizar e registrar experimentos científicos",
                        "traduzir números em elementos visuais,criar planilhas,gráficos,etc",
                        "criar textos, histórias, contos, quadrinhos, jornal, etc",
                        "aprender a identificar e escrever letras e palavras",
                        "Gravar e produzir vídeos, músicas ou animações",
                        "produzir fotos, desenhos, pinturas ou ilustrações",""
                        ],
        "Sim (%)": [99.6,94,95.3,92.4,4.5,6.8,27.2,28.7,18.7,43.5,37.5,46.5,54.5,54.5],
        "Não (%)": [0.4,5.6,4.7,7.5,95.4,93.2,72.7,71.3,81.3,56.4,62.3,53.4,56,45.4]
    }

data_alunos = {
    "Situação - uso de tecnologias": [
        "Que usam computador em seu domicílio",
        "Que possui computador por auxílio",
        "acesso à internet","",
        "uso de redes sociais","",
        "Fontes de informação sobre o uso de tecnologias","","","","","","","",
        "Alunos que usam a internet para ensinar",
        "atividades educacionais na escola","","","","","","","","","",
        "motivos para não acessar a internet na escola","","","","","","","",""
        ],

    "Situação secundária":["",
                           "governo ou escola",
                           "à domicílio",
                           "instituição",
                           "uso pessoal",
                           "realizar atividades escolares",
                           "curso online",
                           "sozinha(o)",
                           "professores ou educadores da escola",
                           "outros alunos ou amigos",
                           "irmãos, tios, primos",
                           "vídeos ou tutoriais na internet",
                           "pais ou responsáveis",
                           "não se atualiza sobre internet e seus usos","",
                           "usam o celular ou computador para pesquisar sobre as aulas",
                           "Assistir vídeos sobre os assuntos das aulas",
                           "ler textos em celulares ou computadores",
                           "Fazer apresentações em slides em computador ou celular",
                           "criar gráficos ou planilhas em computador ou celular",
                           "escrever textos em computador ou celular",
                           "gravar ou editar músicas e vídeos ",
                           "editar fotos ou imagens ",
                           "jogar jogos que os professores solicitaram",
                           "fazer tarefas em computador ou celular junto a colegas",
                           "falta computador na escola",
                           "falta acesso à internet na escola",
                           "a escola proíbe o acesso à internet",
                           "a escola proíbe o uso de telefone/celulares",
                           "os professores não usam internet em suas atividades",
                           "o sinal de internet é insuficiente",
                           "não sabe como acessar internet na escola",
                           "não gosta de acessar internet na escola ",
                           "outros motivos"
                           ],

    "Sim (%)": [60.4,7.1,93.7,76.6,99.5,72.6,23.1,87.9,44.1,67.8,54.5,79.1,59.6,15,68.1,83.8,66.8,73.8,58.8,43.5,62.6,46.3,52.2,60.4,71.9, 39.3,32,53.3,63.6,65.7,57.7,34.7,35.1,12.2],
    "Não (%)": [39.6,92.9,6.3,23.4,0.5,27.4,76.9,12.1,55.9,32.2,45.5,20.9,40.4,75,31.9,16.2,33.2,26.2,41.2,56.5,37.4,53.7,47.8,39.6,28.1, 60.7,68,46.7,36.4,34.3,42.3,65.3,64.9,87.8]
}

data_escola = {

}

df =  pd.DataFrame(data_prof)
df1 = pd.DataFrame(data_alunos)
df2 = pd.DataFrame(data_escola)

# print()
# print("                                             Acesso das tecnologias pela comunidade escolar ")
# print()

# print("Professores - 2022")
# print(df)
# print()

# print("Alunos - 2022")
# print(df1)
# print()

# print("Escola urbanas e rurais - 2020")
# print(df2)
# print()
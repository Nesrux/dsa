votaram = dict()
def verifica_eleitor(nome: str):
    if votaram.get(nome):
        print("mande embora!")
    else:
        votaram[nome] = True
        print("deixa votar")

verifica_eleitor("tom")
verifica_eleitor("marcos")
verifica_eleitor("tom")
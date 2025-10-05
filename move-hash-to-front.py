str = "s#hy#am#s#un#dar#"
word=""
hash=""
for x in str:
    if x=="#":
        hash+=x
    else:
        word+=x
print(hash+word)

from flask import Flask
app = Flask('myapp')


@app.route('/test/<int:a>/<int:b>')

def myfunc(a,b):
    return str(a+b)

app.run(host ='0.0.0.0', debug= true)
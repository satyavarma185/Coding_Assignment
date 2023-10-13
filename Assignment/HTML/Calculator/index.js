function clearScreen() {
    var inp = document.getElementById("result")
    inp.value = ''
}

function display(val) {
    var v = document.getElementById("result")
    v.value += val
}

function calculate() {
    var p = document.getElementById("result").value
    var q = eval(p)
    document.getElementById("result").value = q
}
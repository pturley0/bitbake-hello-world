DESCRIPTION = "Layer A Recipe"
PN = 'a'
PV = '1'

python do_build() {
    bb.plain("Hello, World!");
}

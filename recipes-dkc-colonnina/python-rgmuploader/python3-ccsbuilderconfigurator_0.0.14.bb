
SUMMARY = "CCS Build Configurator"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ccsbuilderconfigurator/ccsbuilderconfigurator-0.0.14.tar.gz"
SRC_URI[md5sum] = "7ca92c4d49eebf82d608c88d245be8a1"
SRC_URI[sha256sum] = "3baf8911fa62005ab82a6716d4ac79fb15ee2d6883f68af2ca887fc9006d48ba"

S = "${WORKDIR}/ccsbuilderconfigurator-0.0.14"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"


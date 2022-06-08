
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ti/ti-0.1.4.tar.gz"
SRC_URI[sha256sum] = "271bbcc2c4b3270bb9985fbdf6650f16e7b4eee6c5dfa1e291c47998b4e610f3"

S = "${WORKDIR}/ti-0.1.4"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"


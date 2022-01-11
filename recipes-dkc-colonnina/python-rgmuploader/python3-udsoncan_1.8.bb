
SUMMARY = "Udsoncan "
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/udsoncan/udsoncan-1.8.tar.gz"
SRC_URI[md5sum] = "b0f4b121064338a7ab2f886ea0983d19"
SRC_URI[sha256sum] = "490578341aa0ca93d637775362d29b6f5629c64d8d5a792cd901353d8eecaea8"

S = "${WORKDIR}/udsoncan-1.8"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"


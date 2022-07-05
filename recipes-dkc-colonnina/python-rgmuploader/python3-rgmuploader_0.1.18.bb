
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.18.tar.gz"
SRC_URI[sha256sum] = "fe62ce116e89bdb322621467dd82401312d7be621b05df13f2f10700c9ab421b"

S = "${WORKDIR}/rgmuploader-0.1.18"

RDEPENDS_${PN} += " python3-singleton-decorator"



SUMMARY = "CCS Build Configurator"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ccsbuilderconfigurator/ccsbuilderconfigurator-0.0.15.tar.gz"
SRC_URI[md5sum] = "48e5f1af2a45811566ad5e6b69e4c79d"
SRC_URI[sha256sum] = "f6351515a2eb4834cbfa2d20e266b55b1714e2913f7829268f14dde34ea9ea7f"

S = "${WORKDIR}/ccsbuilderconfigurator-0.0.15"

DEPENDS += " "

